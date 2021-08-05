package typings.webpackMerge

import typings.webpackMerge.mod.MergeStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackMergeStrings {
  
  @js.native
  sealed trait append
    extends StObject
       with MergeStrategy
  inline def append: append = "append".asInstanceOf[append]
  
  @js.native
  sealed trait prepend
    extends StObject
       with MergeStrategy
  inline def prepend: prepend = "prepend".asInstanceOf[prepend]
  
  @js.native
  sealed trait replace
    extends StObject
       with MergeStrategy
  inline def replace: replace = "replace".asInstanceOf[replace]
}
