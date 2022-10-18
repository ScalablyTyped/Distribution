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
  Mode extends 'sync' ? webdriverio.webdriverio/build/types.MultiRemoteBrowserReferenceSync & webdriverio.webdriverio/build/types.MultiRemoteBrowserSync : webdriverio.webdriverio/build/types.MultiRemoteBrowserReferenceAsync & webdriverio.webdriverio/build/types.MultiRemoteBrowserAsync
  }}}
  */
@js.native
trait MultiRemoteBrowser[Mode /* <: sync | async */] extends StObject
