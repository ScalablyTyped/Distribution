package typings.typedoc.anon

import typings.typedoc.typedocStrings.expand
import typings.typedoc.typedocStrings.packages
import typings.typedoc.typedocStrings.resolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expand extends StObject {
  
  /**
    * The default behavior in v0.21 and earlier. Behaves like the resolve behavior, but will recursively
    * expand directories into an entry point for each file within the directory.
    */
  val Expand: expand
  
  /**
    * Alternative resolution mode useful for monorepos. With this mode, TypeDoc will look for a package.json
    * and tsconfig.json under each provided entry point. The `main` field of each package will be documented.
    */
  val Packages: packages
  
  /**
    * The default behavior in v0.22+, expects all provided entry points as being part of a single program.
    * Any directories included in the entry point list will result in `dir/index.([cm][tj]s|[tj]sx?)` being used.
    */
  val Resolve: resolve
}
object Expand {
  
  inline def apply(): Expand = {
    val __obj = js.Dynamic.literal(Expand = "expand", Packages = "packages", Resolve = "resolve")
    __obj.asInstanceOf[Expand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
    
    inline def setExpand(value: expand): Self = StObject.set(x, "Expand", value.asInstanceOf[js.Any])
    
    inline def setPackages(value: packages): Self = StObject.set(x, "Packages", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: resolve): Self = StObject.set(x, "Resolve", value.asInstanceOf[js.Any])
  }
}
