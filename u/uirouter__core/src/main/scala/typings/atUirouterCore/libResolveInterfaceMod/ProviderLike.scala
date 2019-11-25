package typings.atUirouterCore.libResolveInterfaceMod

import typings.atUirouterCore.libStateInterfaceMod.ResolveTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderLike extends ResolveTypes {
  var deps: js.UndefOr[js.Array[_]] = js.undefined
  var provide: js.Any
  var useClass: js.UndefOr[js.Any] = js.undefined
  var useExisting: js.UndefOr[js.Any] = js.undefined
  var useFactory: js.UndefOr[js.Function] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object ProviderLike {
  @scala.inline
  def apply(
    provide: js.Any,
    deps: js.Array[_] = null,
    useClass: js.Any = null,
    useExisting: js.Any = null,
    useFactory: js.Function = null,
    useValue: js.Any = null
  ): ProviderLike = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (useClass != null) __obj.updateDynamic("useClass")(useClass.asInstanceOf[js.Any])
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting.asInstanceOf[js.Any])
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    if (useValue != null) __obj.updateDynamic("useValue")(useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderLike]
  }
}

