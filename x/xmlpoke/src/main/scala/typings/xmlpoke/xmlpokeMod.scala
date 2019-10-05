package typings.xmlpoke

import org.scalablytyped.runtime.Instantiable1
import typings.xmlpoke.XmlPoke.API
import typings.xmlpoke.XmlPoke.XmlValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlpoke", JSImport.Namespace)
@js.native
object xmlpokeMod extends js.Object {
  @js.native
  class CDataValue protected ()
    extends typings.xmlpoke.XmlPoke.CDataValue {
    def this(value: String) = this()
    /* CompleteClass */
    override var value: String = js.native
  }
  
  @js.native
  class XmlString protected () extends XmlValue {
    def this(value: String) = this()
    /* CompleteClass */
    override var value: String = js.native
  }
  
  var CDataValue: Instantiable1[/* value */ String, typings.xmlpoke.XmlPoke.CDataValue] = js.native
  var XmlString: Instantiable1[/* value */ String, XmlValue] = js.native
  def apply(xml: String, modify: js.Function1[/* api */ API, Unit]): String = js.native
}

