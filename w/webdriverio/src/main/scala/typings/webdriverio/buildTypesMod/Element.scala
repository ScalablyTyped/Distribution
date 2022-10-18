package typings.webdriverio.buildTypesMod

import typings.webdriverio.webdriverioStrings.async
import typings.webdriverio.webdriverioStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Mode extends 'sync' ? webdriverio.webdriverio/build/types.ElementSync : webdriverio.webdriverio/build/types.ElementAsync
  }}}
  */
@js.native
trait Element[Mode /* <: sync | async */] extends StObject
