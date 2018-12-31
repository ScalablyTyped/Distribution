package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RepositoryCleanOptions extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "RepositoryCleanOptions")
@js.native
object RepositoryCleanOptions extends js.Object {
  /**
    * Re-create $(agnet.buildDirectory) which contains $(build.sourcesDirectory), $(build.binariesDirectory) and any folders that left from previous build.
    */
  @js.native
  sealed trait AllBuildDir
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.RepositoryCleanOptions
  
  @js.native
  sealed trait Source
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.RepositoryCleanOptions
  
  @js.native
  sealed trait SourceAndOutputDir
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.RepositoryCleanOptions
  
  /**
    * Re-create $(build.sourcesDirectory)
    */
  @js.native
  sealed trait SourceDir
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.RepositoryCleanOptions
  
  /* 3 */ val AllBuildDir: AllBuildDir with scala.Double = js.native
  /* 0 */ val Source: Source with scala.Double = js.native
  /* 1 */ val SourceAndOutputDir: SourceAndOutputDir with scala.Double = js.native
  /* 2 */ val SourceDir: SourceDir with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.RepositoryCleanOptions with scala.Double
  ] = js.native
}

