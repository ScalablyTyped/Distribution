
# Scala.js typings for vscode-languageserver-types

Typings are for version 3.14.0

## Library description:
Types used by the Language server for node

|                    |                 |
| ------------------ | :-------------: |
| Full name          | vscode-languageserver-types |
| Keywords           | - |
| # releases         | 31 |
| # dependents       | 66 |
| # downloads        | 5822115 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/Microsoft/vscode-languageserver-node#readme)
- [Bugs](https://github.com/Microsoft/vscode-languageserver-node/issues)
- [Repository](https://github.com/Microsoft/vscode-languageserver-node)
- [Npm](https://www.npmjs.com/package/vscode-languageserver-types)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 * Position in a text document expressed as zero-based line and character offset.
 * The offsets are based on a UTF-16 string representation. So a string of the form
 * `a𐐀b` the character offset of the character `a` is 0, the character offset of `𐐀`
 * is 1 and the character offset of b is 3 since `𐐀` is represented using two code
 * units in UTF-16.
 *
 * Positions are line end character agnostic. So you can not specify a position that
 * denotes `\r|\n` or `\n|` where `|` represents the character offset.
 */

```

