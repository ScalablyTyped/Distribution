package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreStrings.`props-aliased`
import typings.vueCompilerCore.vueCompilerCoreStrings.`setup-const`
import typings.vueCompilerCore.vueCompilerCoreStrings.`setup-let`
import typings.vueCompilerCore.vueCompilerCoreStrings.`setup-maybe-ref`
import typings.vueCompilerCore.vueCompilerCoreStrings.`setup-reactive-const`
import typings.vueCompilerCore.vueCompilerCoreStrings.`setup-ref`
import typings.vueCompilerCore.vueCompilerCoreStrings.data
import typings.vueCompilerCore.vueCompilerCoreStrings.options
import typings.vueCompilerCore.vueCompilerCoreStrings.props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.vueCompilerCoreStrings.data
  - typings.vueCompilerCore.vueCompilerCoreStrings.props
  - typings.vueCompilerCore.vueCompilerCoreStrings.`props-aliased`
  - typings.vueCompilerCore.vueCompilerCoreStrings.`setup-let`
  - typings.vueCompilerCore.vueCompilerCoreStrings.`setup-const`
  - typings.vueCompilerCore.vueCompilerCoreStrings.`setup-reactive-const`
  - typings.vueCompilerCore.vueCompilerCoreStrings.`setup-maybe-ref`
  - typings.vueCompilerCore.vueCompilerCoreStrings.`setup-ref`
  - typings.vueCompilerCore.vueCompilerCoreStrings.options
*/
trait BindingTypes extends StObject
object BindingTypes {
  
  /**
    * returned from data()
    */
  inline def DATA: data = "data".asInstanceOf[data]
  
  /**
    * declared by other options, e.g. computed, inject
    */
  inline def OPTIONS: options = "options".asInstanceOf[options]
  
  /**
    * declared as a prop
    */
  inline def PROPS: props = "props".asInstanceOf[props]
  
  /**
    * a local alias of a `<script setup>` destructured prop.
    * the original is stored in __propsAliases of the bindingMetadata object.
    */
  inline def PROPS_ALIASED: `props-aliased` = "props-aliased".asInstanceOf[`props-aliased`]
  
  /**
    * a const binding that can never be a ref.
    * these bindings don't need `unref()` calls when processed in inlined
    * template expressions.
    */
  inline def SETUP_CONST: `setup-const` = "setup-const".asInstanceOf[`setup-const`]
  
  /**
    * a let binding (may or may not be a ref)
    */
  inline def SETUP_LET: `setup-let` = "setup-let".asInstanceOf[`setup-let`]
  
  /**
    * a const binding that may be a ref.
    */
  inline def SETUP_MAYBE_REF: `setup-maybe-ref` = "setup-maybe-ref".asInstanceOf[`setup-maybe-ref`]
  
  /**
    * a const binding that does not need `unref()`, but may be mutated.
    */
  inline def SETUP_REACTIVE_CONST: `setup-reactive-const` = "setup-reactive-const".asInstanceOf[`setup-reactive-const`]
  
  /**
    * bindings that are guaranteed to be refs
    */
  inline def SETUP_REF: `setup-ref` = "setup-ref".asInstanceOf[`setup-ref`]
}
