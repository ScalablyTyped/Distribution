package typings.yargs

import org.scalablytyped.runtime.StringDictionary
import typings.y18n.mod.Y18N
import typings.yargs.commonTypesMod.Dictionary
import typings.yargs.usageMod.UsageInstance
import typings.yargs.yargsMod.Arguments
import typings.yargs.yargsMod.YargsInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod {
  
  @JSImport("yargs/build/lib/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validation(yargs: YargsInstance, usage: UsageInstance, y18n: Y18N): ValidationInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("validation")(yargs.asInstanceOf[js.Any], usage.asInstanceOf[js.Any], y18n.asInstanceOf[js.Any])).asInstanceOf[ValidationInstance]
  
  trait CustomCheck extends StObject {
    
    def func(argv: Arguments, aliases: StringDictionary[js.Array[String]]): js.Any
    
    var global: Boolean
  }
  object CustomCheck {
    
    inline def apply(func: (Arguments, StringDictionary[js.Array[String]]) => js.Any, global: Boolean): CustomCheck = {
      val __obj = js.Dynamic.literal(func = js.Any.fromFunction2(func), global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomCheck]
    }
    
    extension [Self <: CustomCheck](x: Self) {
      
      inline def setFunc(value: (Arguments, StringDictionary[js.Array[String]]) => js.Any): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyOrPos = String | Double
  
  @js.native
  trait ValidationInstance extends StObject {
    
    @JSName("check")
    def check_aliases(
      f: js.Function2[
          /* argv */ Arguments, 
          /* import warning: importer.ImportType#apply Failed type conversion: yargs-parser.yargs-parser.DetailedArguments['aliases'] */ /* aliases */ js.Any, 
          js.Any
        ],
      global: Boolean
    ): Unit = js.native
    
    def conflicting(argv: Arguments): Unit = js.native
    
    def conflicts(key: String): Unit = js.native
    def conflicts(key: String, value: String): Unit = js.native
    def conflicts(key: String, value: js.Array[String]): Unit = js.native
    def conflicts(key: Dictionary[String | js.Array[String]]): Unit = js.native
    def conflicts(key: Dictionary[String | js.Array[String]], value: String): Unit = js.native
    def conflicts(key: Dictionary[String | js.Array[String]], value: js.Array[String]): Unit = js.native
    
    def customChecks(argv: Arguments, aliases: StringDictionary[js.Array[String]]): Unit = js.native
    
    def freeze(): Unit = js.native
    
    def getConflicting(): Dictionary[js.Array[js.UndefOr[String]]] = js.native
    
    def getImplied(): Dictionary[js.Array[KeyOrPos]] = js.native
    
    def implications(argv: Arguments): Unit = js.native
    
    def implies(key: String): Unit = js.native
    def implies(key: String, value: js.Array[KeyOrPos]): Unit = js.native
    def implies(key: String, value: KeyOrPos): Unit = js.native
    def implies(key: Dictionary[KeyOrPos | js.Array[KeyOrPos]]): Unit = js.native
    def implies(key: Dictionary[KeyOrPos | js.Array[KeyOrPos]], value: js.Array[KeyOrPos]): Unit = js.native
    def implies(key: Dictionary[KeyOrPos | js.Array[KeyOrPos]], value: KeyOrPos): Unit = js.native
    
    def isValidAndSomeAliasIsNotNew(key: String, aliases: StringDictionary[js.Array[String]]): Boolean = js.native
    
    def limitedChoices(argv: Arguments): Unit = js.native
    
    def nonOptionCount(argv: Arguments): Unit = js.native
    
    def positionalCount(required: Double, observed: Double): Unit = js.native
    
    def recommendCommands(cmd: String, potentialCommands: js.Array[String]): Unit = js.native
    
    def requiredArguments(argv: Arguments): Unit = js.native
    
    def reset(localLookup: Dictionary[js.Any]): ValidationInstance = js.native
    
    def unfreeze(): Unit = js.native
    
    def unknownArguments(
      argv: Arguments,
      aliases: StringDictionary[js.Array[String]],
      positionalMap: Dictionary[js.Any],
      isDefaultCommand: Boolean
    ): Unit = js.native
    
    def unknownCommands(argv: Arguments): Boolean = js.native
  }
}
