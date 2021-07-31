package typings.tslint

import org.scalablytyped.runtime.StringDictionary
import typings.tslint.completedDocsRuleMod.DocType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exclusionDescriptorsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.blockExclusionMod.IBlockExclusionDescriptor
    - typings.tslint.classExclusionMod.IClassExclusionDescriptor
    - typings.tslint.tagExclusionMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends StObject
  object ExclusionDescriptor {
    
    @scala.inline
    def IBlockExclusionDescriptor(): typings.tslint.blockExclusionMod.IBlockExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tslint.blockExclusionMod.IBlockExclusionDescriptor]
    }
    
    @scala.inline
    def IClassExclusionDescriptor(): typings.tslint.classExclusionMod.IClassExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tslint.classExclusionMod.IClassExclusionDescriptor]
    }
    
    @scala.inline
    def ITagExclusionDescriptor(): typings.tslint.tagExclusionMod.ITagExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tslint.tagExclusionMod.ITagExclusionDescriptor]
    }
  }
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}
