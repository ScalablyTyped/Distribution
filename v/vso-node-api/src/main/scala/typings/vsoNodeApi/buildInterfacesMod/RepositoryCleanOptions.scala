package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RepositoryCleanOptions extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "RepositoryCleanOptions")
@js.native
object RepositoryCleanOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RepositoryCleanOptions with Double] = js.native
  
  /**
    * Re-create $(agnet.buildDirectory) which contains $(build.sourcesDirectory), $(build.binariesDirectory) and any folders that left from previous build.
    */
  @js.native
  sealed trait AllBuildDir extends RepositoryCleanOptions
  /* 3 */ @js.native
  object AllBuildDir extends TopLevel[AllBuildDir with Double]
  
  @js.native
  sealed trait Source extends RepositoryCleanOptions
  /* 0 */ @js.native
  object Source extends TopLevel[Source with Double]
  
  @js.native
  sealed trait SourceAndOutputDir extends RepositoryCleanOptions
  /* 1 */ @js.native
  object SourceAndOutputDir extends TopLevel[SourceAndOutputDir with Double]
  
  /**
    * Re-create $(build.sourcesDirectory)
    */
  @js.native
  sealed trait SourceDir extends RepositoryCleanOptions
  /* 2 */ @js.native
  object SourceDir extends TopLevel[SourceDir with Double]
}
