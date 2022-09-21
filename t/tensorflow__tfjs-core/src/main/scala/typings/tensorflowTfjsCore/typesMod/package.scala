package typings.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type LoadHandler = js.Function0[js.Promise[ModelArtifacts]]

type LoadHandlerSync = js.Function0[ModelArtifacts]

type OnProgressCallback = js.Function1[/* fraction */ Double, Unit]

type SaveHandler = js.Function1[/* modelArtifact */ ModelArtifacts, js.Promise[SaveResult]]

type SaveHandlerSync = js.Function1[/* modelArtifact */ ModelArtifacts, SaveResult]

type WeightsManifestConfig = js.Array[WeightsManifestGroupConfig]
