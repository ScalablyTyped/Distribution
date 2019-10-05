package typings.virtualDashDom.VirtualDOM

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VProperties
  extends /**
  The relaxation on `style` above is the reason why we need `any` as an option
  on the indexer type.
  */
/* index */ StringDictionary[
      js.Any | String | Boolean | Double | VHook | EventHandler | (StringDictionary[String | Boolean | Double])
    ] {
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    I would like to use {[index: string]: string}, but then we couldn't use an
    object literal when setting the styles, since TypeScript doesn't seem to
    infer that {'fontSize': string; 'fontWeight': string;} is actually quite
    assignable to the type { [index: string]: string; }
    */
  var style: js.UndefOr[js.Any] = js.undefined
}

object VProperties {
  @scala.inline
  def apply(
    StringDictionary: /**
    The relaxation on `style` above is the reason why we need `any` as an option
    on the indexer type.
    */
  /* index */ StringDictionary[
      js.Any | String | Boolean | Double | VHook | EventHandler | (StringDictionary[String | Boolean | Double])
    ] = null,
    attributes: StringDictionary[String] = null,
    style: js.Any = null
  ): VProperties = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[VProperties]
  }
}

