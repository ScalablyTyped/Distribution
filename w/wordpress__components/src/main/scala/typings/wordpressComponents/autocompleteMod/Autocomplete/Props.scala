package typings.wordpressComponents.autocompleteMod.Autocomplete

import typings.react.mod.global.JSX.Element
import typings.wordpressRichText.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[T] extends js.Object {
  var completers: js.Array[Completer[T]]
  var onChange: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
  var onReplace: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
  var record: js.UndefOr[Value] = js.undefined
  def children(props: RenderProps): Element | Null
}

object Props {
  @scala.inline
  def apply[T](
    children: RenderProps => Element | Null,
    completers: js.Array[Completer[T]],
    onChange: /* value */ Value => Unit = null,
    onReplace: /* value */ Value => Unit = null,
    record: Value = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), completers = completers.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReplace != null) __obj.updateDynamic("onReplace")(js.Any.fromFunction1(onReplace))
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

