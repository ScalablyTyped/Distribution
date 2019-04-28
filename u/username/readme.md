
# Scala.js typings for username

Typings are for version v3.0.0

## Library description:
Get the username of the current user

|                    |                 |
| ------------------ | :-------------: |
| Full name          | username |
| Keywords           | username, user, login, name, logname, lname, whoami, shell, env, var, environment, variable |
| # releases         | 4 |
| # dependents       | 146 |
| # downloads        | 4076205 |
| # stars            | 5 |

## Links
- [Homepage](https://github.com/sindresorhus/username#readme)
- [Bugs](https://github.com/sindresorhus/username/issues)
- [Repository](https://github.com/sindresorhus/username)
- [Npm](https://www.npmjs.com/package/username)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for username v3.0.0
// Project: https://www.npmjs.com/package/username
// Definitions by: Klaus Reimer <https://github.com/kayahr>
//                 Akos Krivachy <https://github.com/krivachy>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
/**
 * Tries to get the username from the LOGNAME, USER, LNAME or USERNAME environment variables.
 * Falls back to `id -un` on OS X / Linux and `whoami` on Windows in the rare case none of the environment
 * variables are set. The result is cached.
 *
 * @return Promise<string> A promise containing the username or empty string if not found.
 */

```

