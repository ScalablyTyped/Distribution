package typings.svelteLeafletjs.mod

import typings.leaflet.mod.ImageOverlay_
import typings.svelte.mod.SvelteComponentTyped
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelteLeafletjs.anon.Bounds
import typings.svelteLeafletjs.anon.GetImageOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "ImageOverlay")
@js.native
open class ImageOverlay protected ()
  extends SvelteComponentTyped[Bounds, PathEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[GetImageOverlay]) = this()
  
  def getImageOverlay(): ImageOverlay_ = js.native
}
