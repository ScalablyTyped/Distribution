package typings.timezonecomplete

import typings.timezonecomplete.basicsMod.TimeStruct
import typings.timezonecomplete.localeMod.PartialLocale
import typings.timezonecomplete.timezoneMod.TimeZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("timezonecomplete/dist/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(dateTimeString: String, formatString: String): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(dateTimeString: String, formatString: String, overrideZone: Null, allowTrailing: Boolean): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Unit,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(dateTimeString: String, formatString: String, overrideZone: Unit, allowTrailing: Boolean): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Unit,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Unit,
    allowTrailing: Unit,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(dateTimeString: String, formatString: String, overrideZone: TimeZone): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(dateTimeString: String, formatString: String, overrideZone: TimeZone, allowTrailing: Boolean): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  @scala.inline
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: TimeZone,
    allowTrailing: Unit,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  
  @scala.inline
  def parseable(dateTimeString: String, formatString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseable")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseable")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean, locale: PartialLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseable")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Unit, locale: PartialLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseable")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait AwareTimeStruct extends StObject {
    
    /**
      * The time struct
      */
    var time: TimeStruct
    
    /**
      * The time zone (can be undefined)
      */
    var zone: js.UndefOr[TimeZone] = js.undefined
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
