package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleExampleMod {
  
  @JSImport("wix-ui-core/dist/src/components/signature-input/docs/SimpleExample", "SimpleExample")
  @js.native
  val SimpleExample: /* "\nimport * as React from 'react';\nimport {SignatureInput} from 'wix-ui-core/signature-input';\n\nclass ExampleSignatureInput extends React.Component {\n  render() {\n    return <SignatureInput>\n      <div\n        style={{\n          display: 'flex',\n          flexDirection: 'column',\n          alignItems: 'flex-start'\n        }}\n      >\n        <SignatureInput.Title>\n          {({ getTitleProps }) => (\n            <span {...getTitleProps()}>Enter your signature here:</span>\n          )}\n        </SignatureInput.Title>\n        <SignatureInput.SigningPad style={{ border: '1px solid black', width: 300, height: 150 }} />\n        <SignatureInput.ClearButton>\n          {({ getClearButtonProps }) => (\n            <button\n              {...getClearButtonProps({\n                onClick: () => console.log('clear callback'),\n              })}\n            >\n              Clear\n            </button>\n          )}\n        </SignatureInput.ClearButton>\n      </div>\n    </SignatureInput>;\n  }\n}" */ String = js.native
}
