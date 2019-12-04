package typings.tslint

import org.scalablytyped.runtime.StringDictionary
import typings.tslint.libRulesCompletedDashDocsExclusionDescriptorsMod.ExclusionDescriptor
import typings.tslint.libRulesCompletedDashDocsExclusionDescriptorsMod.InputExclusionDescriptor
import typings.tslint.libRulesCompletedDocsRuleMod.DocType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusionDescriptors", JSImport.Namespace)
@js.native
object libRulesCompletedDashDocsExclusionDescriptorsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDashDocsBlockExclusionMod.IBlockExclusionDescriptor
    - typings.tslint.libRulesCompletedDashDocsClassExclusionMod.IClassExclusionDescriptor
    - typings.tslint.libRulesCompletedDashDocsTagExclusionMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends js.Object
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}

