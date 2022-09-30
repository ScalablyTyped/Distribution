package typings.svelteLeafletjs.mod

import org.scalablytyped.runtime.TopLevel
import typings.svelteLeafletjs.svelteLeafletjsStrings.onadd
import typings.svelteLeafletjs.svelteLeafletjsStrings.onautopanstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.onbaselayerchange
import typings.svelteLeafletjs.svelteLeafletjsStrings.onblur
import typings.svelteLeafletjs.svelteLeafletjsStrings.onclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.oncontextmenu
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondblclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondrag
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondragend
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondragstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.onfocus
import typings.svelteLeafletjs.svelteLeafletjsStrings.onlayeradd
import typings.svelteLeafletjs.svelteLeafletjsStrings.onlayerremove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onload
import typings.svelteLeafletjs.svelteLeafletjsStrings.onloading
import typings.svelteLeafletjs.svelteLeafletjsStrings.onlocationerror
import typings.svelteLeafletjs.svelteLeafletjsStrings.onlocationfound
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmousedown
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmousemove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseout
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseover
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseup
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmoveend
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmovestart
import typings.svelteLeafletjs.svelteLeafletjsStrings.onoverlayadd
import typings.svelteLeafletjs.svelteLeafletjsStrings.onoverlayremove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupclose
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupopen
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpreclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.onremove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onresize
import typings.svelteLeafletjs.svelteLeafletjsStrings.ontileerror
import typings.svelteLeafletjs.svelteLeafletjsStrings.ontileload
import typings.svelteLeafletjs.svelteLeafletjsStrings.ontileloadstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.ontileunload
import typings.svelteLeafletjs.svelteLeafletjsStrings.onunload
import typings.svelteLeafletjs.svelteLeafletjsStrings.onviewreset
import typings.svelteLeafletjs.svelteLeafletjsStrings.onzoom
import typings.svelteLeafletjs.svelteLeafletjsStrings.onzoomend
import typings.svelteLeafletjs.svelteLeafletjsStrings.onzoomlevelschange
import typings.svelteLeafletjs.svelteLeafletjsStrings.onzoomstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** This is technically not required since we know every property is a function, but TS doesn't know that */
type AssertIsFunction[T] = T

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
type CreateSvelteEventMap[ReactEventMap] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ EventName in keyof ReactEventMap as svelte-leafletjs.svelte-leafletjs.RemoveOn<EventName> ]: -? std.NonNullable<std.Parameters<svelte-leafletjs.svelte-leafletjs.AssertIsFunction<std.NonNullable<ReactEventMap[EventName]>>>[0]>}
  */ typings.svelteLeafletjs.svelteLeafletjsStrings.CreateSvelteEventMap & TopLevel[ReactEventMap]

type MapEventKeys = js.Array[
onlocationfound | ondragstart | onzoomlevelschange | onzoom | ondrag | ondblclick | onbaselayerchange | oncontextmenu | onoverlayadd | onmouseout | onviewreset | onoverlayremove | onzoomstart | onlayerremove | onclick | onresize | onmovestart | onfocus | onmouseup | onmoveend | onmove | onmouseover | onpreclick | onzoomend | onautopanstart | onblur | onload | ondragend | onlocationerror | onpopupopen | onmousemove | onpopupclose | onunload | onlayeradd | onmousedown]

type MarkerEventKeys = js.Array[
ondragstart | ondrag | ondblclick | oncontextmenu | onremove | onmouseout | onadd | onclick | onmove | onmouseover | ondragend | onpopupopen | onpopupclose | onmousedown]

type PathEventKeys = js.Array[
ondblclick | oncontextmenu | onremove | onmouseout | onadd | onclick | onmouseover | onpopupopen | onpopupclose | onmousedown]

/** Given a string `onX`, this returns `X` */
type RemoveOn[T] = Any

type TileLayerEventKeys = js.Array[ontileloadstart | ontileerror | ontileload | onloading | onload | ontileunload]
