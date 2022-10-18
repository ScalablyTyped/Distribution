package typings.svelteLeafletjs.mod

import typings.leaflet.mod.Tooltip_
import typings.svelte.mod.SvelteComponentTyped
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelteLeafletjs.anon.EventsGetTooltip
import typings.svelteLeafletjs.anon.GetTooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "Tooltip")
@js.native
open class Tooltip protected ()
  extends SvelteComponentTyped[GetTooltip, PathEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[EventsGetTooltip]) = this()
  
  def getTooltip(): Tooltip_ = js.native
}
