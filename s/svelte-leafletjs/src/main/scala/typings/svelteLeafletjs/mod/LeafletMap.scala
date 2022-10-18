package typings.svelteLeafletjs.mod

import typings.leaflet.mod.Map_
import typings.svelte.mod.SvelteComponentTyped
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelteLeafletjs.anon.GetMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "LeafletMap")
@js.native
open class LeafletMap protected ()
  extends SvelteComponentTyped[GetMap, MapEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[GetMap]) = this()
  
  def getMap(): Map_ = js.native
}
