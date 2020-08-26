package typings.xmlCore

import typings.xmlCore.typesMod.ICollection
import typings.xmlCore.xmlObjectMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core/dist/types/xml_collection", JSImport.Namespace)
@js.native
object xmlCollectionMod extends js.Object {
  @js.native
  class XmlCollection[I /* <: XmlObject */] ()
    extends XmlObject
       with ICollection[I] {
    /**
      * The maximum number of elements
      */
    var MaxOccurs: Double = js.native
    /**
      * The minimum number of elements
      */
    var MinOccurs: Double = js.native
    var items: js.Array[I] = js.native
    @JSName("Count")
    def Count_MXmlCollection: Double = js.native
    /* InferMemberOverrides */
    override def IsEmpty(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object XmlCollection extends js.Object {
    var parser: js.Any = js.native
  }
  
}

