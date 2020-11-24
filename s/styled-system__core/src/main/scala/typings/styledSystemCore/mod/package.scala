package typings.styledSystemCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Config = /** Property name exposed for use in components */
  org.scalablytyped.runtime.StringDictionary[typings.styledSystemCore.mod.ConfigStyle | scala.Boolean]
  
  type ObjectOrArray[T, K /* <: /* keyof any */ java.lang.String */] = js.Array[T] | (typings.std.Record[K, T | (typings.std.Record[K, T]) | js.Array[T]])
  
  type Scale = typings.styledSystemCore.mod.ObjectOrArray[scala.Double | java.lang.String, /* keyof any */ java.lang.String]
}
