package typings.svelteLeafletjs.mod

import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.svelte.mod.SvelteComponentTyped
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelteLeafletjs.anon.GetIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "Icon")
@js.native
open class Icon protected ()
  extends SvelteComponentTyped[GetIcon, scala.Nothing, scala.Nothing] {
  def this(options: ComponentConstructorOptions[GetIcon]) = this()
  
  def getIcon(): Icon_[IconOptions] = js.native
}
