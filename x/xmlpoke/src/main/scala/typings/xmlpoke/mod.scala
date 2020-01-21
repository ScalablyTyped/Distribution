package typings.xmlpoke

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.xmlpoke.XmlPoke.API
import typings.xmlpoke.XmlPoke.XmlValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlpoke", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  
  def apply(xml: String, modify: js.Function1[/* api */ API, Unit]): String = js.native
  @js.native
  object CDataValue
    extends TopLevel[Instantiable1[/* value */ String, typings.xmlpoke.XmlPoke.CDataValue]]
  
  @js.native
  object XmlString extends TopLevel[Instantiable1[/* value */ String, XmlValue]]
  
}

