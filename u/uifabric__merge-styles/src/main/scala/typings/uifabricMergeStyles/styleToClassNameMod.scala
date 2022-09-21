package typings.uifabricMergeStyles

import org.scalablytyped.runtime.StringDictionary
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istyleoptionsMod.IStyleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleToClassNameMod {
  
  @JSImport("@uifabric/merge-styles/lib/styleToClassName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyRegistration(registration: IRegistration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyRegistration")(registration.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyRegistration(registration: IRegistration, specificityMultiplier: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRegistration")(registration.asInstanceOf[js.Any], specificityMultiplier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def serializeRuleEntries(options: IStyleOptions, ruleEntries: StringDictionary[String | Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeRuleEntries")(options.asInstanceOf[js.Any], ruleEntries.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def styleToClassName(options: IStyleOptions, args: IStyle*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("styleToClassName")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def styleToRegistration(options: IStyleOptions, args: IStyle*): js.UndefOr[IRegistration] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleToRegistration")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.UndefOr[IRegistration]]
  
  trait IRegistration extends StObject {
    
    var args: js.Array[IStyle]
    
    var className: String
    
    var key: String
    
    var rulesToInsert: js.Array[String]
  }
  object IRegistration {
    
    inline def apply(args: js.Array[IStyle], className: String, key: String, rulesToInsert: js.Array[String]): IRegistration = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rulesToInsert = rulesToInsert.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRegistration]
    }
    
    extension [Self <: IRegistration](x: Self) {
      
      inline def setArgs(value: js.Array[IStyle]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: IStyle*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRulesToInsert(value: js.Array[String]): Self = StObject.set(x, "rulesToInsert", value.asInstanceOf[js.Any])
      
      inline def setRulesToInsertVarargs(value: String*): Self = StObject.set(x, "rulesToInsert", js.Array(value*))
    }
  }
}
