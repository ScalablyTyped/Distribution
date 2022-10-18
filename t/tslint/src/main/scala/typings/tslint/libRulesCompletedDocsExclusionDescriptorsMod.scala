package typings.tslint

import org.scalablytyped.runtime.StringDictionary
import typings.tslint.libRulesCompletedDocsRuleMod.DocType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesCompletedDocsExclusionDescriptorsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDocsBlockExclusionMod.IBlockExclusionDescriptor
    - typings.tslint.libRulesCompletedDocsClassExclusionMod.IClassExclusionDescriptor
    - typings.tslint.libRulesCompletedDocsTagExclusionMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends StObject
  object ExclusionDescriptor {
    
    inline def IBlockExclusionDescriptor(): typings.tslint.libRulesCompletedDocsBlockExclusionMod.IBlockExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tslint.libRulesCompletedDocsBlockExclusionMod.IBlockExclusionDescriptor]
    }
    
    inline def IClassExclusionDescriptor(): typings.tslint.libRulesCompletedDocsClassExclusionMod.IClassExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tslint.libRulesCompletedDocsClassExclusionMod.IClassExclusionDescriptor]
    }
    
    inline def ITagExclusionDescriptor(): typings.tslint.libRulesCompletedDocsTagExclusionMod.ITagExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tslint.libRulesCompletedDocsTagExclusionMod.ITagExclusionDescriptor]
    }
  }
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}
