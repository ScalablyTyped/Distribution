package typings.tslint

import org.scalablytyped.runtime.StringDictionary
import typings.tslint.completedDocsRuleMod.DocType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/completed-docs/exclusionDescriptors", JSImport.Namespace)
@js.native
object exclusionDescriptorsMod extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.blockExclusionMod.IBlockExclusionDescriptor
    - typings.tslint.classExclusionMod.IClassExclusionDescriptor
    - typings.tslint.tagExclusionMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends js.Object
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}
