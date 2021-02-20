package typings.uifabricMergeStyles

import org.scalablytyped.runtime.StringDictionary
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istyleoptionsMod.IStyleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleToClassNameMod {
  
  @JSImport("@uifabric/merge-styles/lib/styleToClassName", "applyRegistration")
  @js.native
  def applyRegistration(registration: IRegistration): Unit = js.native
  @JSImport("@uifabric/merge-styles/lib/styleToClassName", "applyRegistration")
  @js.native
  def applyRegistration(registration: IRegistration, specificityMultiplier: Double): Unit = js.native
  
  @JSImport("@uifabric/merge-styles/lib/styleToClassName", "serializeRuleEntries")
  @js.native
  def serializeRuleEntries(options: IStyleOptions, ruleEntries: StringDictionary[String | Double]): String = js.native
  
  @JSImport("@uifabric/merge-styles/lib/styleToClassName", "styleToClassName")
  @js.native
  def styleToClassName(options: IStyleOptions, args: IStyle*): String = js.native
  
  @JSImport("@uifabric/merge-styles/lib/styleToClassName", "styleToRegistration")
  @js.native
  def styleToRegistration(options: IStyleOptions, args: IStyle*): js.UndefOr[IRegistration] = js.native
  
  @js.native
  trait IRegistration extends StObject {
    
    var args: js.Array[IStyle] = js.native
    
    var className: String = js.native
    
    var key: String = js.native
    
    var rulesToInsert: js.Array[String] = js.native
  }
  object IRegistration {
    
    @scala.inline
    def apply(args: js.Array[IStyle], className: String, key: String, rulesToInsert: js.Array[String]): IRegistration = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rulesToInsert = rulesToInsert.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRegistration]
    }
    
    @scala.inline
    implicit class IRegistrationMutableBuilder[Self <: IRegistration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[IStyle]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: IStyle*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesToInsert(value: js.Array[String]): Self = StObject.set(x, "rulesToInsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesToInsertVarargs(value: String*): Self = StObject.set(x, "rulesToInsert", js.Array(value :_*))
    }
  }
}
