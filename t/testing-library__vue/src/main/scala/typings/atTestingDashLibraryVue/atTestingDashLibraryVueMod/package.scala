package typings.atTestingDashLibraryVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atTestingDashLibraryVueMod {
  import typings.std.Partial
  import typings.vue.typesVueMod.Vue

  type AsyncFireObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): std.Promise<void>}
    */ typings.atTestingDashLibraryVue.atTestingDashLibraryVueStrings.AsyncFireObject with js.Any
  type ConfigurationCallback[V /* <: Vue */] = js.Function3[
    /* vue */ V, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Store<any> */ /* store */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Router */ /* router */ js.Any, 
    (Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> */ js.Any
    ]) | Unit
  ]
}
