package typings.vhtml.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  * Empty mapped types (`Pick<{}, never>`) are almost identical to the empty
  * object type (`{}`). However, TypeScript seems to treat them differently for
  * the purposes of checking `JSX.LibraryManagedAttributes`.
  *
  * This type alias converts any empty-ish type to a plain empty object type, so
  * that we can work around said behavior.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {} extends T ? {} : T
  }}}
  */
@js.native
trait SafeEmptyType[T] extends StObject
