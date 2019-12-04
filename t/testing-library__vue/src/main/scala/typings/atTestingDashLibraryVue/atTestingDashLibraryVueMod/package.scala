package typings.atTestingDashLibraryVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atTestingDashLibraryVueMod {
  import typings.std.Partial
  import typings.vue.typesVueMod.Vue
  import typings.vueDashRouter.vueDashRouterMod.default
  import typings.vuex.vuexMod.Store

  type AsyncFireObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): std.Promise<void>}
    */ typings.atTestingDashLibraryVue.atTestingDashLibraryVueStrings.AsyncFireObject with js.Any
  type ConfigurationCallback[V /* <: Vue */] = js.Function3[
    /* vue */ V, 
    /* store */ Store[js.Any], 
    /* router */ default, 
    (Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> */ js.Any
    ]) | Unit
  ]
}
