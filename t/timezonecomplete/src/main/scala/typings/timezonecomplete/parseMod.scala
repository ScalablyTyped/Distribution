package typings.timezonecomplete

import typings.timezonecomplete.basicsMod.TimeStruct
import typings.timezonecomplete.localeMod.PartialLocale
import typings.timezonecomplete.timezoneMod.TimeZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(dateTimeString: String, formatString: String): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(dateTimeString: String, formatString: String, overrideZone: Null, allowTrailing: Boolean): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(dateTimeString: String, formatString: String, overrideZone: TimeZone): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: TimeZone,
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(dateTimeString: String, formatString: String, overrideZone: TimeZone, allowTrailing: Boolean): AwareTimeStruct = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parse")
  @js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  
  @JSImport("timezonecomplete/dist/lib/parse", "parseable")
  @js.native
  def parseable(dateTimeString: String, formatString: String): Boolean = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parseable")
  @js.native
  def parseable(
    dateTimeString: String,
    formatString: String,
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): Boolean = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parseable")
  @js.native
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean): Boolean = js.native
  @JSImport("timezonecomplete/dist/lib/parse", "parseable")
  @js.native
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean, locale: PartialLocale): Boolean = js.native
  
  @js.native
  trait AwareTimeStruct extends StObject {
    
    /**
      * The time struct
      */
    var time: TimeStruct = js.native
    
    /**
      * The time zone (can be undefined)
      */
    var zone: js.UndefOr[TimeZone] = js.native
  }
  object AwareTimeStruct {
    
    @scala.inline
    def apply(time: TimeStruct): AwareTimeStruct = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwareTimeStruct]
    }
    
    @scala.inline
    implicit class AwareTimeStructMutableBuilder[Self <: AwareTimeStruct] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTime(value: TimeStruct): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZone(value: TimeZone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
}
