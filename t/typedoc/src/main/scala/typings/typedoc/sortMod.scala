package typings.typedoc

import typings.typedoc.declarationMod.DeclarationReflection
import typings.typedoc.typedocStrings.`enum-value-ascending`
import typings.typedoc.typedocStrings.`enum-value-descending`
import typings.typedoc.typedocStrings.`instance-first`
import typings.typedoc.typedocStrings.`required-first`
import typings.typedoc.typedocStrings.`source-order`
import typings.typedoc.typedocStrings.`static-first`
import typings.typedoc.typedocStrings.alphabetical
import typings.typedoc.typedocStrings.kind
import typings.typedoc.typedocStrings.visibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  @JSImport("typedoc/dist/lib/utils/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/utils/sort", "SORT_STRATEGIES")
  @js.native
  val SORT_STRATEGIES: js.Tuple9[
    `source-order`, 
    alphabetical, 
    `enum-value-ascending`, 
    `enum-value-descending`, 
    `static-first`, 
    `instance-first`, 
    visibility, 
    `required-first`, 
    kind
  ] = js.native
  
  inline def sortReflections(reflections: js.Array[DeclarationReflection], strategies: js.Array[SortStrategy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortReflections")(reflections.asInstanceOf[js.Any], strategies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.typedocStrings.`source-order`
    - typings.typedoc.typedocStrings.alphabetical
    - typings.typedoc.typedocStrings.`enum-value-ascending`
    - typings.typedoc.typedocStrings.`enum-value-descending`
    - typings.typedoc.typedocStrings.`static-first`
    - typings.typedoc.typedocStrings.`instance-first`
    - typings.typedoc.typedocStrings.visibility
    - typings.typedoc.typedocStrings.`required-first`
    - typings.typedoc.typedocStrings.kind
  */
  trait SortStrategy extends StObject
}
