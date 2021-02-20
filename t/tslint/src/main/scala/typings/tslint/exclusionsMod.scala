package typings.tslint

import typings.std.Map
import typings.tslint.completedDocsRuleMod.DocType
import typings.tslint.exclusionDescriptorsMod.IInputExclusionDescriptors
import typings.tslint.exclusionMod.Exclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exclusionsMod {
  
  @JSImport("tslint/lib/rules/completed-docs/exclusions", "constructExclusionsMap")
  @js.native
  def constructExclusionsMap(ruleArguments: js.Array[IInputExclusionDescriptors]): ExclusionsMap = js.native
  
  @js.native
  trait DocTypeExclusions extends StObject {
    
    var overloadsSeparateDocs: js.UndefOr[Boolean] = js.native
    
    var requirements: js.Array[Exclusion[_]] = js.native
  }
  object DocTypeExclusions {
    
    @scala.inline
    def apply(requirements: js.Array[Exclusion[_]]): DocTypeExclusions = {
      val __obj = js.Dynamic.literal(requirements = requirements.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocTypeExclusions]
    }
    
    @scala.inline
    implicit class DocTypeExclusionsMutableBuilder[Self <: DocTypeExclusions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverloadsSeparateDocs(value: Boolean): Self = StObject.set(x, "overloadsSeparateDocs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverloadsSeparateDocsUndefined: Self = StObject.set(x, "overloadsSeparateDocs", js.undefined)
      
      @scala.inline
      def setRequirements(value: js.Array[Exclusion[_]]): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequirementsVarargs(value: Exclusion[js.Any]*): Self = StObject.set(x, "requirements", js.Array(value :_*))
    }
  }
  
  type ExclusionsMap = Map[DocType, DocTypeExclusions]
}
