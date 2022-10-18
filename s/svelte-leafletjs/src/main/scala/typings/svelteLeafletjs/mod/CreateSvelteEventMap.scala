package typings.svelteLeafletjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper to transform the event maps defined in `@types/react-leaflet`.
  * This makes `@types/react-leaflet` the source of truth for the events in `@types/svelte-leafletjs`.
  *
  * ```ts
  * // original
  * type ReactEventMap = {
  *   onsomething?(e: SomeEvent): void
  * }
  *
  * // converted
  * type SvelteEventMap = {
  *   something: SomeEvent;
  * }
  * ```
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ EventName in keyof ReactEventMap as svelte-leafletjs.svelte-leafletjs.RemoveOn<EventName> ]: -? std.NonNullable<std.Parameters<svelte-leafletjs.svelte-leafletjs.AssertIsFunction<std.NonNullable<ReactEventMap[EventName]>>>[0]>}
  }}}
  */
@js.native
trait CreateSvelteEventMap[ReactEventMap] extends StObject
