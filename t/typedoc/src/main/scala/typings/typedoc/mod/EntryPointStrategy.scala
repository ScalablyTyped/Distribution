package typings.typedoc.mod

import typings.typedoc.typedocStrings.expand
import typings.typedoc.typedocStrings.packages
import typings.typedoc.typedocStrings.resolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EntryPointStrategy {
  
  /**
    * The default behavior in v0.21 and earlier. Behaves like the resolve behavior, but will recursively
    * expand directories into an entry point for each file within the directory.
    */
  @JSImport("typedoc", "EntryPointStrategy.Expand")
  @js.native
  val Expand: expand = js.native
  
  /**
    * Alternative resolution mode useful for monorepos. With this mode, TypeDoc will look for a package.json
    * and tsconfig.json under each provided entry point. The `main` field of each package will be documented.
    */
  @JSImport("typedoc", "EntryPointStrategy.Packages")
  @js.native
  val Packages: packages = js.native
  
  /**
    * The default behavior in v0.22+, expects all provided entry points as being part of a single program.
    * Any directories included in the entry point list will result in `dir/index.([cm][tj]s|[tj]sx?)` being used.
    */
  @JSImport("typedoc", "EntryPointStrategy.Resolve")
  @js.native
  val Resolve: resolve = js.native
}
