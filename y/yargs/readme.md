```
// Type definitions for yargs 12.0
// Project: https://github.com/chevex/yargs, https://yargs.js.org
// Definitions by: Martin Poelstra <https://github.com/poelstra>
//                 Mizunashi Mana <https://github.com/mizunashi-mana>
//                 Jeffery Grajkowski <https://github.com/pushplay>
//                 Jeff Kenney <https://github.com/jeffkenney>
//                 Jimi (Dimitris) Charalampidis <https://github.com/JimiC>
//                 Steffen Viken Valvåg <https://github.com/steffenvv>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 3.0
// The following TSLint rules have been disabled:
// unified-signatures: Because there is useful information in the argument names of the overloaded signatures
// Convention:
// Use 'union types' when:
//  - parameter types have similar signature type (i.e. 'string | ReadonlyArray<string>')
//  - parameter names have the same semantic meaning (i.e. ['command', 'commands'] , ['key', 'keys'])
//    An example for not using 'union types' is the declaration of 'env' where `prefix` and `enable` parameters
//    have different semantics. On the other hand, in the declaration of 'usage', a `command: string` parameter
//    has the same semantic meaning with declaring an overload method by using `commands: ReadonlyArray<string>`,
//    thus it's preferred to use `command: string | ReadonlyArray<string>`
// Use parameterless declaration instead of declaring all parameters optional,
// when all parameters are optional and more than one
```