package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XmlNodeType extends js.Object

@JSImport("xml-core/XmlCore", "XmlNodeType")
@js.native
object XmlNodeType extends js.Object {
  @js.native
  sealed trait Attribute
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait CDATA
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait Comment
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait Document
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait DocumentFragment
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait DocumentType
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait Element
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait EndElement
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait EndEntity
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait Entity
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait EntityReference
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait None
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait Notation
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait ProcessingInstruction
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait SignificantWhitespace
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait Text
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait Whitespace
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
  @js.native
  sealed trait XmlDeclaration
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType
  
}

