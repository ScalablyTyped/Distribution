package typings.wordpressBlockEditor.plainTextMod.PlainText

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextareaAutosize.Props * / any, 'onChange'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextareaAutosize.Props * / any[P]} */ trait Props extends js.Object {
  /**
    * The component forwards the `ref` property to the `TextareaAutosize` component.
    */
  var ref: js.UndefOr[
    Ref[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextareaAutosize */ _
    ]
  ] = js.undefined
  /**
    * String value of the textarea
    */
  var value: String
  /**
    * Called when the value changes.
    */
  def onChange(value: String): Unit
}

object Props {
  @scala.inline
  def apply(
    onChange: String => Unit,
    value: String,
    ref: js.UndefOr[
      Null | (Ref[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextareaAutosize */ _
      ])
    ] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

