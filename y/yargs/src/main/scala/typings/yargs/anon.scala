package typings.yargs

import typings.std.Exclude
import typings.yargs.commonTypesMod.Dictionary
import typings.yargs.yargsBooleans.`false`
import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsMod.OptionDefinition
import typings.yargs.yargsMod.YargsInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(key: String, value: js.Any): YargsInstance = js.native
    def apply(key: String, value: js.Any, defaultDescription: String): YargsInstance = js.native
    def apply(keys: js.Array[String], value: Exclude[js.Any, js.Function]): YargsInstance = js.native
    def apply(keys: Dictionary[js.Any]): YargsInstance = js.native
  }
  
  @js.native
  trait FnCallKeyOptionDefinition extends StObject {
    
    def apply(keyOptionDefinitions: Dictionary[OptionDefinition]): YargsInstance = js.native
    def apply(key: String, optionDefinition: OptionDefinition): YargsInstance = js.native
  }
  
  @js.native
  trait FnCallMinMaxMsg extends StObject {
    
    def apply(keyMsgs: Dictionary[js.UndefOr[String]]): YargsInstance = js.native
    def apply(keyMsgs: Dictionary[js.UndefOr[String]], max: js.Array[String]): YargsInstance = js.native
    def apply(keyMsgs: Dictionary[js.UndefOr[String]], max: js.Array[String], msg: String): YargsInstance = js.native
    def apply(keys: String): YargsInstance = js.native
    def apply(keys: String, max: js.Array[String]): YargsInstance = js.native
    def apply(keys: String, max: js.Array[String], msg: String): YargsInstance = js.native
    def apply(keys: String, max: js.Array[String], msg: `true`): YargsInstance = js.native
    def apply(keys: String, msg: String): YargsInstance = js.native
    def apply(keys: String, msg: `true`): YargsInstance = js.native
    def apply(keys: js.Array[String]): YargsInstance = js.native
    def apply(keys: js.Array[String], max: js.Array[String]): YargsInstance = js.native
    def apply(keys: js.Array[String], max: js.Array[String], msg: String): YargsInstance = js.native
    def apply(keys: js.Array[String], max: js.Array[String], msg: `true`): YargsInstance = js.native
    def apply(keys: js.Array[String], msg: String): YargsInstance = js.native
    def apply(keys: js.Array[String], msg: `true`): YargsInstance = js.native
    def apply(min: Double): YargsInstance = js.native
    def apply(min: Double, max: String): YargsInstance = js.native
    def apply(min: Double, max: String, msg: String): YargsInstance = js.native
    def apply(min: Double, max: Double): YargsInstance = js.native
    def apply(min: Double, max: Double, msg: String): YargsInstance = js.native
    def apply(min: Double, max: Unit, msg: String): YargsInstance = js.native
  }
  
  @js.native
  trait FnCallOptMsg extends StObject {
    
    def apply(): YargsInstance = js.native
    def apply(opt: String): YargsInstance = js.native
    def apply(opt: String, msg: String): YargsInstance = js.native
    def apply(opt: Unit, msg: String): YargsInstance = js.native
    def apply(opt: `false`): YargsInstance = js.native
  }
  
  @js.native
  trait FnCallStrArg1Arg2Arg3 extends StObject {
    
    def apply(str: String): String = js.native
    def apply(str: String, arg1: String): String = js.native
    def apply(str: String, arg1: String, arg2: String): String = js.native
    def apply(str: String, arg1: String, arg2: String, arg3: String): String = js.native
    def apply(str: String, arg1: String, arg2: Unit, arg3: String): String = js.native
    def apply(str: String, arg1: Unit, arg2: String): String = js.native
    def apply(str: String, arg1: Unit, arg2: String, arg3: String): String = js.native
    def apply(str: String, arg1: Unit, arg2: Unit, arg3: String): String = js.native
  }
  
  trait Max extends StObject {
    
    var max: Double
    
    var maxMsg: js.UndefOr[String | Null] = js.undefined
    
    var min: Double
    
    var minMsg: js.UndefOr[String | Null] = js.undefined
  }
  object Max {
    
    inline def apply(max: Double, min: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxMsg(value: String): Self = StObject.set(x, "maxMsg", value.asInstanceOf[js.Any])
      
      inline def setMaxMsgNull: Self = StObject.set(x, "maxMsg", null)
      
      inline def setMaxMsgUndefined: Self = StObject.set(x, "maxMsg", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinMsg(value: String): Self = StObject.set(x, "minMsg", value.asInstanceOf[js.Any])
      
      inline def setMinMsgNull: Self = StObject.set(x, "minMsg", null)
      
      inline def setMinMsgUndefined: Self = StObject.set(x, "minMsg", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Inlined std.Partial<yargs.yargs/build/lib/yargs.Arguments> */
  trait PartialArguments extends StObject {
    
    @JSName("$0")
    var $0: js.UndefOr[String] = js.undefined
    
    @JSName("_")
    var _underscore: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialArguments {
    
    inline def apply(): PartialArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialArguments]
    }
    
    extension [Self <: PartialArguments](x: Self) {
      
      inline def set$0(value: String): Self = StObject.set(x, "$0", value.asInstanceOf[js.Any])
      
      inline def set$0Undefined: Self = StObject.set(x, "$0", js.undefined)
      
      inline def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreUndefined: Self = StObject.set(x, "_", js.undefined)
      
      inline def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value :_*))
    }
  }
}
