package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object a11yExampleMod {
  
  @JSImport("wix-ui-core/dist/src/components/signature-input/docs/A11yExample", "A11yExample")
  @js.native
  val A11yExample: /* "\nimport * as React from 'react';\nimport { SignatureInput } from 'wix-ui-core/signature-input';\n\nclass ExampleSignatureInput extends React.Component {\n  padApi = undefined;\n\n  state = {hasFocus: false};\n\n  handleInit = (padApi) => {\n    this.padApi = padApi;\n  };\n\n  handleA11yButtonClick = (e) => {\n    e.preventDefault();\n    this.padApi.focus();\n  };\n\n  handleFocus = () => {\n    this.setState({hasFocus: true});\n  }\n\n  handleBlur = () => {\n    this.setState({hasFocus: false});\n  }\n\n  render() {\n    const focusStyles = this.state.hasFocus ? {outline: \"2px solid blue\"} : {};\n\n    return (\n      <div>\n        <SignatureInput>\n          <div\n            style={{\n              display: 'flex',\n              flexDirection: 'column',\n              alignItems: 'flex-start',\n            }}\n          >\n            <SignatureInput.Title>\n              {({ getTitleProps }) => (\n                <span {...getTitleProps()}>Enter your signature here:</span>\n              )}\n            </SignatureInput.Title>\n            <SignatureInput.SigningPad\n              onInit={this.handleInit}\n              onFocus={this.handleFocus}\n              onBlur={this.handleBlur}\n              style={{ border: '1px solid black', width: 300, height: 150, ...focusStyles }}\n            />\n            <SignatureInput.ClearButton>\n              {({ getClearButtonProps }) => (\n                <button\n                  {...getClearButtonProps({\n                    onClick: () => console.log('clear callback'),\n                  })}\n                >\n                  Clear\n                </button>\n              )}\n            </SignatureInput.ClearButton>\n          </div>\n        </SignatureInput>\n        <p>Click the button below and start typing</p>\n        <button onClick={this.handleA11yButtonClick}>Click to focus a11y input</button>\n      </div>\n    );\n  }\n}\n" */ String = js.native
}
