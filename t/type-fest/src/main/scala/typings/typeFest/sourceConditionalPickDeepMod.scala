package typings.typeFest

import typings.std.PropertyKey
import typings.std.Record
import typings.typeFest.sourceConditionalExceptMod.ConditionalExcept
import typings.typeFest.sourceConditionalSimplifyMod.ConditionalSimplifyDeep
import typings.typeFest.sourceOpaqueMod.Opaque
import typings.typeFest.typeFestStrings.`conditional-pick-deep-symbol`
import typings.typeFest.typeFestStrings.`extends`
import typings.typeFest.typeFestStrings.equality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceConditionalPickDeepMod {
  
  /**
  Assert the condition according to the {@link ConditionalPickDeepOptions.condition|condition} option.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Options['condition'] extends 'equality' ? type-fest.type-fest/source/internal.IsEqual<Type, Condition> : Type extends Condition ? true : false
    }}}
    */
  @js.native
  trait AssertCondition[Type, Condition, Options /* <: ConditionalPickDeepOptions */] extends StObject
  
  type ConditionalPickDeep[Type, Condition, Options /* <: ConditionalPickDeepOptions */] = ConditionalSimplifyDeep[
    ConditionalExcept[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof Type ]: type-fest.type-fest/source/conditional-pick-deep.AssertCondition<Type[Key], Condition, Options> extends true? Type[Key] : Type[Key] extends object? type-fest.type-fest/source/conditional-pick-deep.ConditionalPickDeep<Type[Key], Condition, Options> : type-fest.type-fest/source/conditional-pick-deep.ConditionalPickDeepSymbol} */ js.Any, 
      js.UndefOr[ConditionalPickDeepSymbol | (Record[PropertyKey, scala.Nothing])]
    ], 
    scala.Nothing, 
    Any
  ]
  
  trait ConditionalPickDeepOptions extends StObject {
    
    /**
    	The condition assertion mode.
    	@default 'extends'
    	*/
    var condition: js.UndefOr[`extends` | equality] = js.undefined
  }
  object ConditionalPickDeepOptions {
    
    inline def apply(): ConditionalPickDeepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConditionalPickDeepOptions]
    }
    
    extension [Self <: ConditionalPickDeepOptions](x: Self) {
      
      inline def setCondition(value: `extends` | equality): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    }
  }
  
  /**
  Used to mark properties that should be excluded.
  */
  type ConditionalPickDeepSymbol = Opaque[js.Symbol, `conditional-pick-deep-symbol`]
}
