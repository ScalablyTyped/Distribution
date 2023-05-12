package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceExceptMod {
  
  type Except[ObjectType, KeysType /* <: /* keyof ObjectType */ String */, Options /* <: ExceptOptions */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ KeyType in keyof ObjectType as type-fest.type-fest/source/except.Filter<KeyType, KeysType> ]: ObjectType[KeyType]} */ js.Any
  
  trait ExceptOptions extends StObject {
    
    /**
    	Disallow assigning non-specified properties.
    	Note that any omitted properties in the resulting type will be present in autocomplete as `undefined`.
    	@default false
    	*/
    var requireExactProps: js.UndefOr[Boolean] = js.undefined
  }
  object ExceptOptions {
    
    inline def apply(): ExceptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExceptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptOptions] (val x: Self) extends AnyVal {
      
      inline def setRequireExactProps(value: Boolean): Self = StObject.set(x, "requireExactProps", value.asInstanceOf[js.Any])
      
      inline def setRequireExactPropsUndefined: Self = StObject.set(x, "requireExactProps", js.undefined)
    }
  }
  
  /**
  Filter out keys from an object.
  Returns `never` if `Exclude` is strictly equal to `Key`.
  Returns `never` if `Key` extends `Exclude`.
  Returns `Key` otherwise.
  @example
  ```
  type Filtered = Filter<'foo', 'foo'>;
  //=> never
  ```
  @example
  ```
  type Filtered = Filter<'bar', string>;
  //=> never
  ```
  @example
  ```
  type Filtered = Filter<'bar', 'foo'>;
  //=> 'bar'
  ```
  @see {Except}
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    type-fest.type-fest/source/is-equal.IsEqual<KeyType, ExcludeType> extends true ? never : KeyType extends ExcludeType ? never : KeyType
    }}}
    */
  type Filter[KeyType, ExcludeType] = KeyType
}
