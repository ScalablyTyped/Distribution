package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XmlNodeType extends js.Object

@JSImport("xml-core", "XmlNodeType")
@js.native
object XmlNodeType extends js.Object {
  @js.native
  sealed trait Attribute
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait CDATA
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait Comment
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait Document
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait DocumentFragment
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait DocumentType
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait Element
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait EndElement
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait EndEntity
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait Entity
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait EntityReference
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait None
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait Notation
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait ProcessingInstruction
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait SignificantWhitespace
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait Text
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait Whitespace
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  @js.native
  sealed trait XmlDeclaration
    extends xmlDashCoreLib.xmlDashCoreMod.XmlNodeType
  
  /* 2 */ val Attribute: Attribute with scala.Double = js.native
  /* 4 */ val CDATA: CDATA with scala.Double = js.native
  /* 8 */ val Comment: Comment with scala.Double = js.native
  /* 9 */ val Document: Document with scala.Double = js.native
  /* 11 */ val DocumentFragment: DocumentFragment with scala.Double = js.native
  /* 10 */ val DocumentType: DocumentType with scala.Double = js.native
  /* 1 */ val Element: Element with scala.Double = js.native
  /* 15 */ val EndElement: EndElement with scala.Double = js.native
  /* 16 */ val EndEntity: EndEntity with scala.Double = js.native
  /* 6 */ val Entity: Entity with scala.Double = js.native
  /* 5 */ val EntityReference: EntityReference with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 12 */ val Notation: Notation with scala.Double = js.native
  /* 7 */ val ProcessingInstruction: ProcessingInstruction with scala.Double = js.native
  /* 14 */ val SignificantWhitespace: SignificantWhitespace with scala.Double = js.native
  /* 3 */ val Text: Text with scala.Double = js.native
  /* 13 */ val Whitespace: Whitespace with scala.Double = js.native
  /* 17 */ val XmlDeclaration: XmlDeclaration with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xmlDashCoreLib.xmlDashCoreMod.XmlNodeType with scala.Double] = js.native
}

