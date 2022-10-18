package typings.svelteLeafletjs.mod

import typings.leaflet.mod.Control_.Scale
import typings.svelte.mod.SvelteComponentTyped
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelteLeafletjs.anon.GetScaleControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "ScaleControl")
@js.native
open class ScaleControl protected ()
  extends SvelteComponentTyped[GetScaleControl, scala.Nothing, scala.Nothing] {
  def this(options: ComponentConstructorOptions[GetScaleControl]) = this()
  
  def getScaleControl(): Scale = js.native
}
