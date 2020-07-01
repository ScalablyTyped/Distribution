package typings.testingLibraryReact.anon

import typings.react.mod.ComponentType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @testing-library/react.@testing-library/react.Omit<@testing-library/react.@testing-library/react.RenderOptions<{ readonly getAllByPlaceholderText  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getByPlaceholderText  :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByPlaceholderText  :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryByPlaceholderText  :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByLabelText  :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText  :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly queryByLabelText  :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly getAllByDisplayValue  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByText  :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly findByDisplayValue  :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getAllByRole  :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryAllByTestId  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByPlaceholderText  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getAllByTestId  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText  :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly queryAllByAltText  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle  :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly findAllByText  :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByDisplayValue  :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryAllByText  :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getAllByText  :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByTitle  :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText  :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTitle  :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTestId  :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getByLabelText  :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryAllByTitle  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText  :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByRole  :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly queryByTestId  :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryByRole  :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole  :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByLabelText  :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly getAllByLabelText  :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByDisplayValue  :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByLabelText  :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByTestId  :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getAllByAltText  :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findAllByRole  :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly findAllByAltText  :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly findAllByTitle  :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTestId  :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findByRole  :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly getByText  :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryByDisplayValue  :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByAltText  :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute}>, 'queries'> */
trait OmitRenderOptionsreadonly extends js.Object {
  var baseElement: js.UndefOr[HTMLElement] = js.undefined
  var container: js.UndefOr[HTMLElement] = js.undefined
  var hydrate: js.UndefOr[Boolean] = js.undefined
  var wrapper: js.UndefOr[ComponentType[js.Object]] = js.undefined
}

object OmitRenderOptionsreadonly {
  @scala.inline
  def apply(
    baseElement: HTMLElement = null,
    container: HTMLElement = null,
    hydrate: js.UndefOr[Boolean] = js.undefined,
    wrapper: ComponentType[js.Object] = null
  ): OmitRenderOptionsreadonly = {
    val __obj = js.Dynamic.literal()
    if (baseElement != null) __obj.updateDynamic("baseElement")(baseElement.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(hydrate)) __obj.updateDynamic("hydrate")(hydrate.get.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitRenderOptionsreadonly]
  }
}

