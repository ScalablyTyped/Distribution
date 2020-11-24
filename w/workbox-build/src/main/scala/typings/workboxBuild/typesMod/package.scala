package typings.workboxBuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ManifestTransform = js.Function2[
    /* manifestEntries */ js.Array[typings.workboxBuild.typesMod.ManifestEntry], 
    /* compilation */ js.UndefOr[js.Object], 
    js.Promise[typings.workboxBuild.typesMod.ManifestTransformResult]
  ]
}
