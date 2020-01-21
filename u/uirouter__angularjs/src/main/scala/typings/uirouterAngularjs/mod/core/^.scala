package typings.uirouterAngularjs.mod.core

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.commonCommonMod.Mapper
import typings.uirouterCore.resolveInterfaceMod.ResolvePolicy
import typings.uirouterCore.transitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core")
@js.native
object ^ extends js.Object {
  var defaultResolvePolicy: ResolvePolicy = js.native
  var defaultTransOpts: TransitionOptions = js.native
  var mapObj: js.Function3[
    /* collection */ StringDictionary[js.Any], 
    /* callback */ Mapper[js.Any, js.Any], 
    /* target */ js.UndefOr[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
    ], 
    StringDictionary[js.Any]
  ] = js.native
}

