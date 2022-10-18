package typings.vueReactivity.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dep
  extends StObject
     with Set[ReactiveEffect[Any]]
     with TrackedMarkers
