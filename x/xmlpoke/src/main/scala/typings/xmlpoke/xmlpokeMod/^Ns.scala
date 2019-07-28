package typings.xmlpoke.xmlpokeMod

import typings.xmlpoke.XmlPokeNs.XmlValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlpoke", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  class CDataValue protected ()
    extends typings.xmlpoke.XmlPokeNs.CDataValue {
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
  
}

