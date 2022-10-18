package typings.uniApp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyObject = Record[String, Any]

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ K in keyof T ]: T[K]}
  }}}
  */
type KVInfer[T] = T

type Void[T] = js.UndefOr[T | Null]
