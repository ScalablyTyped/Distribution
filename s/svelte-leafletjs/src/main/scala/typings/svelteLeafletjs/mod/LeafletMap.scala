package typings.svelteLeafletjs.mod

import typings.leaflet.mod.Map_
import typings.svelte.mod.SvelteComponentTyped
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelteLeafletjs.anon.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "LeafletMap")
@js.native
open class LeafletMap protected ()
  extends SvelteComponentTyped[Events, MapEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[Events]) = this()
  
  def getMap(): Map_ = js.native
}
