package typings.typestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CSSClassNames[K /* <: java.lang.String */] = typings.std.Record[K, java.lang.String]
  
  type CSSClasses[K /* <: java.lang.String */] = typings.std.Record[K, typings.typestyle.typesMod.NestedCSSProperties]
  
  type FontFace = typings.csstype.mod.FontFace
  
  type TLength = scala.Double | java.lang.String
}
