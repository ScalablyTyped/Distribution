package typings.xmlCore

import typings.xmlCore.typesMod.ICollection
import typings.xmlCore.xmlObjectMod.XmlObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlCollectionMod {
  
  @JSImport("xml-core/dist/types/xml_collection", "XmlCollection")
  @js.native
  class XmlCollection[I /* <: XmlObject */] ()
    extends XmlObject
       with ICollection[I] {
    def this(properties: js.Object) = this()
    
    @JSName("Count")
    def Count_MXmlCollection: Double = js.native
    
    /* InferMemberOverrides */
    override def IsEmpty(): Boolean = js.native
    
    /**
      * The maximum number of elements
      */
    var MaxOccurs: Double = js.native
    
    /**
      * The minimum number of elements
      */
    var MinOccurs: Double = js.native
    
    var items: js.Array[I] = js.native
  }
  /* static members */
  object XmlCollection {
    
    @JSImport("xml-core/dist/types/xml_collection", "XmlCollection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xml-core/dist/types/xml_collection", "XmlCollection.parser")
    @js.native
    def parser: js.Any = js.native
    @scala.inline
    def parser_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parser")(x.asInstanceOf[js.Any])
  }
}
